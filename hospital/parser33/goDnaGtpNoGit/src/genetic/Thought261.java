package genetic;
import java.util.ArrayList;
class Thought261 extends Thought{
private static ArrayList<Thought261> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 284.04282266477827;
private double fd1 = 34.69318569717351;
private Thought fo0 = null;
private Thought fo1 = null;
Thought261 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought261 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought261 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought261 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought261 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought261 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought261 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought261 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought261 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought261 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought261 instance = new Thought261 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought73.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought292.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    lb2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb3 = fb0 && fb1;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
    lb3 = lb4 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld5 = 10.708746889890683;
    Thought lo6 = Thought231.getInstance();
    fd0 = fd1 + ld5;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fb1, lb2, lb3, lb4);
}
    double ld7 = 695.352169779349;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
    double ld1 = 316.8524280334826;
    if (fb1) {
        ld1 = fd0 - fd1;
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
}
        } else if (ab4) {
        fb0 = fd1 < ld1;
        fb1 = lb0 || ab1;
        boolean lb2 = false;
        fd0 = fd1 - ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        Output.points[5][3] -= fd0;
        boolean lb3 = true;
        ab4 = fb0 && fb1;
        lb2 = lb3 && lb0;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
        fd1 = ld1 + fd0;
        ab4 = fd1 > ld1;
        fb0 = !fb1;
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    if (lb0) {
        lb1 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(fb0, fb1, lb0, lb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
        ad2 = ad3 - ad4;
        fd0 *= -1;
        fd1 = ad1 - ad2;
        ad3 *= -1;
        Thought lo2 = Thought216.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
        ad2 *= -1;
        boolean lb3 = false;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb0, lb1, fb0);
}
        Output.points[5][4] -= fd1;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
            lb3 = lb0 && lb1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ad1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    Thought lo0 = Thought129.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Output.points[5][5] -= ad4;
    Output.points[5][6] += fd0;
    fd1 *= -1;
        Thought lo1 = Thought385.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][7] += ad1;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    double ld2 = 733.7066821771671;
if(fo0 != null){
      ab4 = fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 716.741751801781;
    Thought lo1 = Thought200.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        ld0 = fd0 + fd1;
        Output.points[5][8] += ld0;
        fb0 = !fb1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = fb1 && fb0;
        } else if (fb1) {
        double ld2 = 683.1701490092653;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought113.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    if (lb1) {
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb2, lb1, fb0);
}
        fd1 = ad1 - ad2;
        boolean lb3 = false;
        Thought lo4 = Thought74.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb3);
        lb1 = fb0 && fb1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Output.points[6][0] -= fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld0 = 195.0762972350458;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0);
}
    double ld1 = 913.2034122530828;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        Thought lo2 = Thought107.getInstance();
        ab1 = ab2 && ab3;
        Output.points[6][1] -= fd0;
        Output.points[6][2] += fd1;
if(ao3 != null){
          ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
        }
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[6][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        Thought lo1 = Thought193.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
        lb0 = ab1 || ab2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    double ld0 = 294.44699514635766;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
        double ld2 = 712.5396844280998;
    fb0 = fd0 < fd1;
    ld0 = ld2 + fd0;
    Thought lo3 = Thought342.getInstance(fb1, lb1, fb0, fb1);
    double ld4 = 287.414655612159;
    lb1 = !fb0;
    fd0 *= -1;
    fd1 = ld0 + ld2;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 > fd0;
        ab1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        Thought lo0 = Thought47.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        fb1 = ab1 && ab2;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab1 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    ab3 = !ab4;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    Thought lo1 = Thought37.getInstance();
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought86.getInstance(ab2, ab3, ab4, fb0);
    Thought lo5 = Thought251.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);
    boolean lb6 = false;
    lb6 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb6 = !ab1;
    Thought lo7 = Thought22.getInstance(fd0, fd1, ad1, ad2);
    Thought lo8 = Thought206.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
          fd1 = fo0.m3();
}
    boolean lb9 = false;
    ad1 *= -1;
    double ld10 = 120.17514648657385;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb2, lb3);
}
    double ld11 = 122.9976309235478;

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Output.points[6][5] -= fd0;
    double ld0 = 228.98619236379977;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    lb1 = fd0 > fd1;
    Thought lo3 = Thought182.getInstance(ld0, fd0, fd1, ld0);
    lb2 = !fb0;
    fd0 *= -1;
    double ld4 = 433.94023059823144;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld4);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
        Output.points[6][6] += ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought108.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    double ld3 = 902.1041774712043;
    lb2 = fb0 && fb1;
    boolean lb4 = false;
    ld3 *= -1;
    lb0 = ad1 < ad2;
    boolean lb5 = true;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, lb4, lb5, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][7] -= fd1;
    Thought lo0 = Thought300.getInstance(ao1, ao2, ao3, ao4);
        fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = false;
    ab1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld2 = 893.7883002921828;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2();
}
    ab1 = fd0 > fd1;
    boolean lb4 = true;
if(ao1 != null){
      ld2 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;
    fb1 = ld2 > fd0;
    lb1 = lb3 || lb4;
    fd1 = ld2 + fd0;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 331.7180373215585;
    Output.points[6][8] -= ld0;
    ab1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          ao1.m1(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        fd0 *= -1;
        fd1 = ld0 + ad1;
        Output.points[7][0] += ad2;
        double ld2 = 754.6165148268036;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
            lb1 = ad2 < ad3;
}}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    double ld0 = 199.10988176033766;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought176.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 *= -1;
    fd1 *= -1;
    double ld2 = 639.6488832014574;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    ld2 = fd0 + fd1;
    fb1 = fb0 && fb1;
    ld0 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > ld0;
    fb1 = fb0 && fb1;
    ld2 = fd0 - fd1;
    Output.points[7][1] -= ld0;
    if (fb0) {
        ld2 = fd0 - fd1;
        ld0 = ld2 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld2, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ld0 + ld2;
        boolean lb3 = true;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 239.87082839473433;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    Output.points[7][2] -= ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo0.m3();
}
    fb1 = lb1 || ab1;
    boolean lb2 = false;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought50.getInstance(ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb2, ab1, ab2, ab3);
}
    Output.points[7][3] -= fd1;
    ab4 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[7][4] += fd0;
    fb0 = fb1 || lb1;
    Thought lo4 = Thought169.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought134.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    lb0 = lb2 || fb0;
    Output.points[7][5] -= ad3;
    fb1 = lb0 && lb2;
    boolean lb3 = true;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][6] -= ad1;
    lb3 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    lb2 = lb3 || fb0;
    ad4 *= -1;
    Thought lo4 = Thought202.getInstance();
    fb1 = lb0 || lb2;
    if (lb3) {
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought87.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought70.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[7][7] += ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    Thought lo1 = Thought273.getInstance();
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, lb0, lb2, lb3, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && lb2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    lb2 = lb3 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 614.1809792038919;
    if (fb0) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        boolean lb1 = false;
        fd0 = fd1 + ld0;
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
        double ld2 = 287.3221573939965;
        fb0 = fb1 && lb1;
        fb0 = !fb1;
        lb1 = fb0 && fb1;
        lb1 = ad4 < fd0;
        Output.points[7][8] -= fd1;
        fb0 = fb1 || lb1;
        ld2 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
        Output.points[8][0] += ad4;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    double ld0 = 200.73899791814355;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = !ab1;
    fd1 = ld0 + fd0;
    ab2 = fd1 < ld0;
    ab3 = ab4 && fb0;
    double ld1 = 837.8565328109652;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, fd0);
}
    Output.points[8][1] += fd1;
    ld0 *= -1;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    double ld0 = 150.27476594678825;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        ab3 = ab4 && fb0;
    double ld1 = 267.68455145393483;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab1 = !ab2;
if(ao4 != null){
          ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][2] -= fd0;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        Thought lo2 = Thought93.getInstance();
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb0, lb1, fb0);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        Output.points[8][3] -= fd0;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
        Thought lo1 = Thought297.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 115.93454175792816;
    lb0 = fd0 < fd1;
    lb2 = ld4 > fd0;
    lb3 = ab1 && ab2;
    double ld5 = 548.4126105824466;
    double ld6 = 57.73243036148208;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    double ld0 = 544.9022935724914;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 *= -1;
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
        lb0 = fd1 > ad1;
        double ld2 = 186.06459983792206;
        Output.points[8][4] -= ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, ld2, ad1);
}
        ad2 = ad3 + ad4;
        fb0 = fb1 && lb1;
        fd0 = fd1 + ld2;
        lb0 = ab1 && ab2;
        ad1 *= -1;
        ad2 *= -1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        } else if (ab4) {
        boolean lb3 = true;
        ab4 = fb0 && fb1;
if(fo0 != null){
          ad1 = fo0.m3();
}
        ad2 = ad3 - ad4;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd1 *= -1;
    double ld1 = 858.4989236348192;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
    lb2 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld1 *= -1;
    fd0 = fd1 + ld1;
    boolean lb3 = true;
    Thought lo4 = Thought45.getInstance(fb0, fb1, lb0, lb2);
    boolean lb5 = true;
    fd0 = fd1 - ld1;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 90.02786549489943;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ld0, ad1, ad2, ad3);
}
    boolean lb1 = false;
    fb0 = !fb1;
    Thought lo2 = Thought381.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
    lb1 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo3 = Thought105.getInstance(fb0, fb1, lb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    boolean lb4 = true;
    lb4 = ad1 < ad2;
    Output.points[8][5] += ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb4);
}
    Thought lo5 = Thought13.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb4);

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought241.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
    double ld2 = 796.0004172014533;
    ab4 = fb0 && fb1;
    Output.points[8][6] += ld2;
    for(int i0=0; i0<10; i0++){
        lb1 = ab1 || ab2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
        if (lb1) {
if(ao4 != null){
              fd1 = ao4.m3(ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
            double ld3 = 247.7621288402964;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
            Thought lo4 = Thought152.getInstance(fo0, fo1, ao1, ao2);
}}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = true;
    Output.points[8][7] -= ad2;
    ab2 = !ab3;
    double ld1 = 554.3803932443031;
    ad2 = ad3 - ad4;
    ab4 = fd0 < fd1;
    ld1 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    fd1 = ld1 + ad1;
    Thought lo3 = Thought126.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = !lb2;
    fd1 = ld1 - ad1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    lb2 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[8][8] -= fd1;
    double ld4 = 88.99201658128402;
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld4, ad1, ad2, lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ld4);
}
    boolean lb5 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 770.4599395660446;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    ld0 = fd0 + fd1;
    lb1 = !lb2;
    Output.points[0][0] -= ld0;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 < fd1;
    lb2 = !fb0;
    ld0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    Thought lo3 = Thought335.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    lb1 = lb2 && fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[0][1] -= fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[0][2] -= fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought45.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
