export const ExploreTopBooks = () =>{
    return(
        <div className='p-5 mb-4 bg-dark header'>
            <div className='container-fluid py-5 text-white 
                d-flex justify-content-center align-items-center'>
                <div>
                    <h1 className='display-5 fw-bold'>Find your next adventure</h1>
                    <div className='row g-0 mb-3'></div>
                    {/* <p className='col-md-8 fs-4'>Where would you like to go next?</p>*/}
                    <a type='button' className='btn main-color btn-lg text-white' href='#'>
                        Browse Library</a>
                </div>
            </div>
        </div>
    );
}